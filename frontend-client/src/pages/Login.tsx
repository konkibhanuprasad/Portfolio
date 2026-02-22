import axios from "axios";
import { useState } from "react"

const Login: React.FC = () => {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const handleLogin = async () => {
        try{
            const response = await axios.post(
                "http://localhost:8080/login",
                {username, password},
                {auth: { username, password}}
            );

            console.log(response);
            alert("Login Succesfully");
        }catch (error){
            console.error(error);
            alert("Login Failed");
        }
    };

    return (
        <div>
            <h2>Login</h2>
            <input type="text" placeholder="UserName" 
            onChange={(e) => setUsername(e.target.value)} />

            <input type="password" placeholder="Password" 
            onChange={(e) => setPassword(e.target.value)} />

            <button onClick={handleLogin}>Login</button>
        </div>
    );
};

export default Login;