function UserInfo() {
  console.log("userinfo on");
  const userName = "kim";
  const age = 25;

  return (
    <div>
      <p>이름: {userName}</p>
      <p>나이: {age}세</p>
      <p>성인 여부: {age >= 20 ? "성인" : "미성년자"}</p>
    </div>
  );
}

export default UserInfo;
