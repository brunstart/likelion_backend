function increaseAndPrint(n) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const value = n + 1;
      if (value === 5) {
        // 제대로 실행안됐을 경우 reject
        const error = new Error();
        error.name = "ValueIsFiveError";
        reject(error);
        return;
      }
      console.log(value); // 제대로 실행됐을 경우 resolve
      resolve(value);
    }, 1000);
  });
}

increaseAndPrint(0)
  .then(increaseAndPrint)
  .then(increaseAndPrint)
  .then(increaseAndPrint)
  .then(increaseAndPrint)
  .catch((e) => {
    console.error(e);
  });

// increaseAndPrint(0)
//   .then((n) => {
//     return increaseAndPrint(n);
//   })
//   .then((n) => {
//     return increaseAndPrint(n);
//   })
//   .then((n) => {
//     return increaseAndPrint(n);
//   })
//   .then((n) => {
//     return increaseAndPrint(n);
//   })
//   .then((n) => {
//     return increaseAndPrint(n);
//   })
//   .catch((e) => {
//     console.error(e);
//   });

// increaseAndPrint(0, (n) => {
//   increaseAndPrint(n, (n) => {
//     increaseAndPrint(n, (n) => {
//       increaseAndPrint(n, (n) => {
//         increaseAndPrint(n, (n) => {
//           console.log("끝!");
//         });
//       });
//     });
//   });
// });
