import {useState, useEffect} from 'react'
import StocksList from '../components/StocksList'

const StocksBox = () => {
    const [stocks, setStocks] = useState([])
    console.log("state", stocks)

    useEffect(() => {
        getStocks()
    }, [])

    const getStocks = () => {
        fetch('https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false')
        .then(res=> res.json())
        .then(apidata => setStocks(apidata))
        console.log("stocks", stocks)
    }

    return (
        <div className='stocks-box'>
            <h1>WSB STOCKS</h1>
            <StocksList stocks={stocks}/>
        </div>
    )
}

export default StocksBox