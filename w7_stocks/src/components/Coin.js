const Coin = ({coin, coinChoice}) => {
    console.log("Coin prop", coin)

    const handleClick = (coinName) => {
        console.log("Clicked", coinName)
        coinChoice(coinName)
    }

    return (
        <div className="coin">
            <p onClick={() => handleClick(coin.name)}>
                {coin.name} 
                Current Price: ${coin.current_price} 
                24h change: {coin.market_cap_change_percentage_24h}
            </p>
            <img src={coin.image} alt="coin" onClick={() => handleClick(coin.name)}/>
        </div>
    )
}

export default Coin