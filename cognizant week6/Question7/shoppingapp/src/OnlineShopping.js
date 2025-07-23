import React, { Component } from "react";
import Cart from "./Cart";

class OnlineShopping extends Component {
  render() {
    const cartItems = [
      { itemname: "T-shirt", price: 499 },
      { itemname: "Jeans", price: 1299 },
      { itemname: "Shoes", price: 2199 },
      { itemname: "Watch", price: 799 },
      { itemname: "Backpack", price: 999 }
    ];

    return (
      <div>
        <h1>🛍️ Welcome to Online Shopping</h1>
        {cartItems.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
