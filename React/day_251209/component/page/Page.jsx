import Main from "./Main";
import Header from "./Header";
import Footer from "./Footer";
import Profile from "./Profile";

const Page = () => {
  const name = "caram";
  const hobbies = ["축구", "딩코", "영수"];

  return (
    <div>
      <Header />
      <Main name={name} hobbies={hobbies} />
      <Footer />
    </div>
  );
};

export default Page;
