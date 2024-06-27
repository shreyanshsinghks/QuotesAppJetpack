package com.hello.shayriapp.routing


sealed class ShayriRoutingItems(val route: String){
    object SplashScreenItem: ShayriRoutingItems("splash")
    object CategoryScreenItem: ShayriRoutingItems("category")
    object ShayriListScreenItem: ShayriRoutingItems("shayriList")
    object FinalShayriView: ShayriRoutingItems("finalshayriview")
}