import Coin from './Coin'

const CoinsList = ({coins, coinChoice }) => {
    console.log("Coins prop", coins);

if (coins.length === 0) return null

return (
    <div className='coins-list'>
        <h3>Coins:</h3>
            <select onChange={(event) => coinChoice(event.target.value)}>
                {coins.map((coin) => {
                    return (    
                    <option key={coin.id} value={coin.name}>
                        <Coin coin={coin} coinChoice={coinChoice}/>
                    </option>
                    )
                })}
            </select>
    </div>
)

}

export default CoinsList