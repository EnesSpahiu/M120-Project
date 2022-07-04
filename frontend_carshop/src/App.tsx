import "./App.css";
import { AuthenticationContextProvider } from "./context/AuthenticationContext";
import ShoppingCartContext from "./context/ShoppingCartContext";
import Router from "./Router/Router";

function App() {
  return (
    <AuthenticationContextProvider>
      <ShoppingCartContext>
        <Router />
      </ShoppingCartContext>
    </AuthenticationContextProvider>
  );
}

export default App;
