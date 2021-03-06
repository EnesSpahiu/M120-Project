import CookieUtility from '../security/CookieUtility';
import { REFRESH_TOKEN } from '../types/Constants/Cookies';
import User from '../types/User';
import ApiService from './ApiService'

const baseURL = "/auth/"

const AuthenticationService = () => ({
  login: async (username:string, password: string) => {
      const params = new URLSearchParams();
      params.append("username", username);
      params.append("password", password);
      const {data} = await ApiService.post(baseURL + "login", params);
      return data;
  },
  requestNewToken: async () => {
      const {data} = await ApiService.get(baseURL + "refresh-token", {
          headers: {Authorization: "Bearer " + CookieUtility.get(REFRESH_TOKEN)},
      })
      return data;
    },
  signup:async (user:User) => {
    console.log({...user})
    return ApiService.post(baseURL + "signup", {...user})
  }
})

export default AuthenticationService
