const CoinTicker = ({coins}) => {
    
    if (coins.legnth === 0) return null 
    return (
        <div className="coin-ticker">
            <marquee direction="left" height="100%">
                {coins.map((coin, index) =>{
                    return (
                        <span key={index}>
                            {coin.symbol.toUpperCase()} $
                            <span className={coin.price_change_24h >= 0 ? 'positive' : 'negative'}>
                                {coin.current_price.toFixed(2)}
                            </span>
                            {index !== coins.length - 1 && ' | '}
                        </span> 
                    )
                })}
            </marquee>
        </div>
    )
}

export default CoinTicker