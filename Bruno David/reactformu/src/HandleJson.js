import React from 'react';
import ReactDOM from 'react-dom';
import $ from 'jquery'


class HandleJson extends React.Component {
    ListarCores(){
        return(
     var products = [
  {
    id: 1,
    name: 'Book',
    price: 15
  },
  {
    id: 2,
    name: 'Burrito',
    price: 8
  },
  {
    id: 3,
    name: 'Spaceship',
    price: 999999999
  },
  {
    id: 4,
    name: 'Dinosaur Bones',
    price: 5000000
  }
];

function buyProduct(productId) {
  // buy the product
}

/* -- Just jQuery -- */
function buyButtonJquery(product) {
  var button = $('<button class="buy-button">$' + product.price
    + '</button>');
  
  // handle click event
  $(button).on('click', function(event) {
    event.preventDefault();
    buyProduct(product.id);
  });

  return button;
}

function productListJustJquery(products, element) {
  var list = $('<ul class="product-list"></ul>');

  products.forEach(function(product) {
    var item = $('<li>' + product.name + '</li>');
    item.append(buyButtonJquery(product));
    list.append(item);
  });

  // replace the existing list if there is one
  var currentList = $(element).find('.product-list');
  if (currentList.length) {
    currentList.replaceWith(list);
  } else {
    $(element).append(list);
  }
}
  }
    )
}

export default HandleJson;