package com.designpatterns.behavoiural.Visitor

interface ItemElement<T> {
    fun Accept( visitor : ShoppingCartVisitor) : Int
}