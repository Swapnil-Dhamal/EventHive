import { useEffect, useState } from 'react';
import API from '../services/api';

export default function Dashboard() {
  const [events, setEvents] = useState([]);

  useEffect(() => {
    API.get('/events').then(res => setEvents(res.data));
  }, []);

  const attendEvent = async (id) => {
    await API.post(`/users/attend/${id}`);
    alert('You are attending this event!');
  };

  return (
    <div className="p-6">
      <h2 className="text-xl font-bold mb-4">All Events</h2>
      <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
        {events.map(event => (
          <div key={event.id} className="p-4 border rounded shadow">
            <h3 className="font-bold text-lg">{event.title}</h3>
            <p>{event.description}</p>
            <p>{new Date(event.dateTime).toLocaleString()}</p>
            <button className="bg-blue-500 text-white px-4 py-1 mt-2 rounded" onClick={() => attendEvent(event.id)}>Attend</button>
          </div>
        ))}
      </div>
    </div>
  );
}
