import { useState } from 'react';
import API from '../services/api';
import { useNavigate } from 'react-router-dom';

export default function Register() {
  const [form, setForm] = useState({ username: '', password: '', role: 'USER' });
  const navigate = useNavigate();

  const handleRegister = async () => {
    await API.post('/auth/register', form);
    navigate('/login');
  };

  return (
    <div className="flex flex-col items-center mt-10">
      <h2 className="text-2xl font-bold">Register</h2>
      <input className="border m-2 p-2" placeholder="Username" onChange={e => setForm({ ...form, username: e.target.value })} />
      <input className="border m-2 p-2" type="password" placeholder="Password" onChange={e => setForm({ ...form, password: e.target.value })} />
      <select className="border m-2 p-2" onChange={e => setForm({ ...form, role: e.target.value })}>
        <option value="USER">User</option>
        <option value="ADMIN">Admin</option>
      </select>
      <button className="bg-green-500 text-white p-2 rounded" onClick={handleRegister}>Register</button>
    </div>
  );
}
