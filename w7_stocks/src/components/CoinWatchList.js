import Coin from './Coin'
const CoinWatchList = ({watchedCoins, coinChoice}) => {
    if (watchedCoins.length !== 0) 
    return (
        <div className="coin-watch-list">
            <h4>Watching:</h4>

            <ul className='watchlist'>
                {watchedCoins.map((coin, index) => {
                    return (
                        <div className='watched-coin'>
                            <li key={index} className='watchlist-item'>
                                <img src={coin.image} alt='watched-coin' onClick={() => coinChoice(coin.name)}></img>
                            </li>
                        </div>
                    )
                })}
            </ul>
        </div>
    )
}

export default CoinWatchList
