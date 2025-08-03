import React from 'react';

const IndianPlayers = () => {
  const T20players = ['Kohli', 'Rohit', 'Rahul', 'Pant'];
  const RanjiTrophy = ['Pujara', 'Saha', 'Shaw'];

  const mergedPlayers = [...T20players, ...RanjiTrophy];

  const oddTeam = mergedPlayers.filter((_, index) => index % 2 === 0);
  const evenTeam = mergedPlayers.filter((_, index) => index % 2 !== 0);

  return (
    <div>
      <h2>Merged Players</h2>
      <ul>
        {mergedPlayers.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((p, i) => <li key={i}>{p}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
