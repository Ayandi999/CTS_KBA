import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 89 },
    { name: 'Rohit Sharma', score: 45 },
    { name: 'KL Rahul', score: 74 },
    { name: 'Shikhar Dhawan', score: 35 },
    { name: 'Hardik Pandya', score: 70 },
    { name: 'Jasprit Bumrah', score: 82 },
    { name: 'Ravindra Jadeja', score: 66 },
    { name: 'Rishabh Pant', score: 93 },
    { name: 'Bhuvneshwar Kumar', score: 48 },
    { name: 'Shreyas Iyer', score: 88 },
    { name: 'Mohammed Shami', score: 52 }
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with Score Below 70</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
