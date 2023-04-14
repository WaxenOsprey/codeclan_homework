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
            </p>
            <img src={coin.image} alt="coin image" onClick={() => handleClick(coin.name)}/>
        </div>
    )
}

export default Coin