import {useState, useEffect} from 'react'
import CoinsList from '../components/CoinsList'
import CoinDetails from '../components/CoinDetails'
import CoinWatchList from '../components/CoinWatchList'

const CoinsBox = () => {
    const [coins, setCoins] = useState([]);
    const [selectedCoin, setSelectedCoin] = useState('');
    const [watchedCoins, setWatchedCoins] = useState([]);

    console.log("state", coins)
    console.log("state", selectedCoin)

    useEffect(() => {
        getCoins()
    }, [])

    const getCoins = () => {
        fetch('https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false')
        .then(res=> res.json())
        .then(apidata => setCoins(apidata))
        console.log("coins", coins)
    }

    const coinChoice = (coinName) => {
        const foundCoin = coins.find((coin) => coinName === coin.name)
        setSelectedCoin(foundCoin)
    }

    const handleWatchedToggle = (coin) => {

        const foundCoin = watchedCoins.find((c) => {
            return c.name === coin.name
        })

        if (!foundCoin) {
            setWatchedCoins([...watchedCoins, coin]);
        }
        else {
            const newWatchedCoins = watchedCoins.filter ( (c) => {
                return c.name !== coin.name
            })
            setWatchedCoins(newWatchedCoins)
        }
    }

    const isWatched = (coin) => {
        const foundCoin = watchedCoins.find ( (c) => {
            return c.name === coin.name
        })

        if (!foundCoin) {
            return false
        }

        return true

    }

    return (
        <div className='coins-box'>
            <h1>Crypto Coins</h1>
            <CoinsList coins={coins} coinChoice={coinChoice} setSelectedCoin={(setSelectedCoin)}/>
            <CoinDetails selectedCoin={selectedCoin} isWatched={isWatched(selectedCoin)} onWatchedToggle={handleWatchedToggle}/>
            <CoinWatchList watchedCoins={watchedCoins}/>
        </div>
    )
}

export default CoinsBox