const Stock = ({stock}) => {
    console.log("Stock prop", stock)

    return (
        <div className="stock">
            <li>
                {stock.name}
            </li>
            <img src={stock.image} alt="coin image" />

        </div>
    )
}

export default Stock