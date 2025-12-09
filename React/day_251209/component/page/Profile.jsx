function Profile({ name, hobbies }) {
  //   const name = "yang";
  //   const hobbies = ["A", "B"];

  return (
    <>
      <h1>Hi, I'm {name}</h1>
      <h2>I like {hobbies.join(",")}</h2>
    </>
  );
}

export default Profile;
