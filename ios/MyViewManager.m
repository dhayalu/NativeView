//
//  MyViewManager.m
//  NativeView
//
//  Created by Dhayalu on 22/03/23.
//


#import <React/RCTViewManager.h>

@interface MyViewManager : RCTViewManager
@end

@implementation MyViewManager

RCT_EXPORT_MODULE(MyView)

- (UIView *)view
{
  UIView * customView = [[UIView alloc] init];
  customView.backgroundColor = [UIColor redColor];
  
  return customView;
}

@end
