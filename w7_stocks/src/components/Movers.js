import React, { useState } from 'react';

const Movers = ({winners, losers, coinChoice}) => {
  const [showWinners, setShowWinners] = useState(false);
  const [showLosers, setShowLosers] = useState(false);

  const handleWinnersClick = () => {
    setShowWinners(true);
    setShowLosers(false);
  }

  const handleLosersClick = () => {
    setShowWinners(false);
    setShowLosers(true);
  }

  return (
    <div className='movers-container'>
        <div className='buttons'>
            <button className='winners-button' onClick={handleWinnersClick}>Winners</button>
            <button className='losers-button' onClick={handleLosersClick}>Losers</button>
        </div>

            {showWinners && (
            <div className='winners'>
            <ul>
                {winners.map((coin) => {
                return (
                    <li key={coin.id}>
                    <span className='coin-name' onClick={() => coinChoice(coin.name)}>
                        {coin.symbol.toUpperCase()}{' '}
                    </span>
                    <span className={coin.price_change_24h >= 0 ? 'positive' : 'negative'}>
                        {coin.current_price.toFixed(2)} ({coin.price_change_percentage_24h.toFixed(2)})%
                    </span>
                    </li>
                )
                })}
            </ul>
            </div>
            )}

            {showLosers && (
            <div className='losers'>
            <ul>
                {losers.map((coin) => {
                return (
                    <li key={coin.id}>
                    <span className='coin-name' onClick={() => coinChoice(coin.name)}>
                    {coin.symbol.toUpperCase()}{' '}
                    </span>
                    <span className={coin.price_change_24h >= 0 ? 'positive' : 'negative'}>
                        {coin.current_price.toFixed(2)} ({coin.price_change_percentage_24h.toFixed(2)})%
                    </span>
                    </li>
                )
                })}
            </ul>
            </div>
            )}

    </div>
  )
}

export default Movers;
