const CoinDetails = ({selectedCoin, onWatchedToggle, isWatched}) => {
    return(
        <div className="coin-details">
            <h4>Details</h4>
            {selectedCoin.name}
            <img src={selectedCoin.image} alt="coin image" />
            <button onClick={() => {onWatchedToggle(selectedCoin);}}>
            {isWatched ? "Remove" : "Add to watchlist"}
            </button>
            
        </div>
    )
}

export default CoinDetails