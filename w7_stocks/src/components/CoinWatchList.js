import Coin from './Coin'
const CoinWatchList = ({watchedCoins}) => {
    if (watchedCoins === 0) return null
    return (
        <div className="coin-watch-list">
            <ul>
                {watchedCoins.map((coin) => {
                    return <li><Coin coin={coin}/></li>
                })}
            </ul>
        </div>
    )
}

export default CoinWatchList
