import { useState } from 'react';
import API from '../services/api';
import { useNavigate } from 'react-router-dom';

export default function Login() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  const handleLogin = async () => {
    const { data } = await API.post('/auth/login', { username, password });
    localStorage.setItem('token', data.token);
    navigate('/dashboard');
  };

  return (
    <div className="flex flex-col items-center mt-10">
      <h2 className="text-2xl font-bold">Login</h2>
      <input className="border m-2 p-2" placeholder="Username" onChange={e => setUsername(e.target.value)} />
      <input className="border m-2 p-2" type="password" placeholder="Password" onChange={e => setPassword(e.target.value)} />
      <button className="bg-blue-500 text-white p-2 rounded" onClick={handleLogin}>Login</button>
    </div>
  );
}
