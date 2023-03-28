//
//  MyModule.m
//  NativeView
//
//  Created by Dhayalu on 28/03/23.
//

#import <Foundation/Foundation.h>
#import "React/RCTBridgeModule.h"

@interface RCT_EXTERN_MODULE(MyModule, NSObject)

//RCT_EXTERN_METHOD(zelleData: (NSString *)appName baseUrl:(NSString *)baseUrl instId:(NSString *)instId product:(NSString *)product ssoKey:(NSString *)ssoKey parameters:(NSDictionary *)parameters pd:(NSDictionary *)pd )

RCT_EXTERN_METHOD(zelleData: (NSString *)baseUrl instId:(NSString *)instId )


@end
