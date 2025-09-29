package Java.day28_250929;

public class LockOptimization {
    // 나쁜 예: 굵은 락
    private final Object lock = new Object();

    public void badMethod() {
        synchronized(lock) {
            // 긴 작업...
            doLongOperation();
            // 실제 동기화가 필요한 부분
            updateSharedData();
        }
    }

    // 좋은 예: 세밀한 락
    public void goodMethod() {
        doLongOperation(); // 락 밖에서 수행

        synchronized(lock) {
            updateSharedData(); // 필요한 부분만 동기화
        }
    }

    private void doLongOperation() {
        // 시간이 오래 걸리는 작업
    }

    private void updateSharedData() {
        // 공유 데이터 수정
    }
}