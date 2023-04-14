import Stock from './Stock'

const StocksList = ({stocks}) => {
    console.log("Stocks prop", stocks);

if (stocks.length === 0) return null

return (
    <div className='stocks-list'>
        <h3>Stocks:</h3>
            <ul>
                {stocks.map((stock) => {
                    return <Stock stock={stock}/>
                })}
            </ul>
    </div>
)

}

export default StocksList