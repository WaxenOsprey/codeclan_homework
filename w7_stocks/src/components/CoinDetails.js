import React from 'react'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faEye } from '@fortawesome/free-solid-svg-icons' 

const CoinDetails = ({selectedCoin, onWatchedToggle, isWatched}) => {
    if (selectedCoin === '') return null
    
    return(
            <div className="coin-details">
                <div className='coin-wrap'>

                    <div className="coin-info">

                        <div className="coin-info-name">
                            {selectedCoin.name}
                            ({selectedCoin.symbol.toUpperCase()})
                        </div>
                    <p>
                            ${selectedCoin.current_price.toFixed(10)}{' '}
                            <span className={selectedCoin.price_change_24h >= 0 ? 'positive' : 'negative'}>
                                {selectedCoin.price_change_24h.toFixed(2)}{' '}
                                ({selectedCoin.price_change_percentage_24h}{'%'})
                            </span>
                    </p> 
                    <h6>As of: {selectedCoin.last_updated}</h6>
                    </div>

                    <div className='icon-container'>
                            {' '}{isWatched ? <span><FontAwesomeIcon icon={faEye} style={{color: "#02caf2",}} className='watch-icon' onClick={() => {onWatchedToggle(selectedCoin);}} /></span> : <span><FontAwesomeIcon icon={faEye} style={{color: "#1f3761",}} onClick={() => {onWatchedToggle(selectedCoin);}} /></span>}
                        </div>


                 </div>

                 <hr />


            <div className='coin-extra'>

            <img src={selectedCoin.image} alt="coin" />
            
    <div className='coin-extra-info'>
        <p>
            <span className="coin-detail-key">Market cap rank:</span>{' '}
            <span className="coin-detail-value">{selectedCoin.market_cap_rank}</span>
        </p> 
        <p>
            <span className="coin-detail-key">Market cap:</span>{' '}
            <span className="coin-detail-value">${selectedCoin.market_cap}</span>
        </p>
        <p>
            <span className="coin-detail-key">Volume:</span>{' '}
            <span className="coin-detail-value">{selectedCoin.total_volume}</span>
        </p>
        <p>
            <span className="coin-detail-key">High (24h):</span>{' '}
            <span className="coin-detail-value">{selectedCoin.high_24h}</span>
        </p>
        <p>
            <span className="coin-detail-key">Low (24h):</span>{' '}
            <span className="coin-detail-value">{selectedCoin.low_24h}</span>
        </p>
    </div>


            </div>
        </div>

    )
}

export default CoinDetails