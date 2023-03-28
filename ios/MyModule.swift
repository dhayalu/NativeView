//
//  MyModule.swift
//  NativeView
//
//  Created by Dhayalu on 28/03/23.
//

import Foundation
import UIKit
import React.RCTBridgeModule


@objc(MyModule)
class MyModule: NSObject{

  var callback: RCTResponseSenderBlock?
  static var baseURL = ""

  //@objc func zelleData(_ appName: String, baseUrl: String, instId: String, product: String, ssoKey:String, parameters: NSDictionary, pd: NSDictionary){
  @objc func zelleData(_ baseUrl: String, instId: String){


    MyModule.baseURL = baseUrl

    NSLog("appname %@  baseUrl %@", baseUrl, instId)

  }


}
