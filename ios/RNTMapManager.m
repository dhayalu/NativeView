#import <UIKit/UIKit.h>

#import <React/RCTViewManager.h>
#import <ZelleSDK/ZelleSDK.h>

@interface RNTMapManager : RCTViewManager
@end

@implementation RNTMapManager

RCT_EXPORT_MODULE(ZelleConnector)

- (UIView *)view
{
  

  //UIViewController *controller = [UIApplication sharedApplication].keyWindow.rootViewController;
  UIViewController *controller = [UIApplication sharedApplication].windows.firstObject.rootViewController;
  
  Zelle * zelle = [[Zelle alloc]initWithApplicationName:@"Demo Bank" baseUrl:@"https://jayjt11.github.io/Sdk/index.html" institutionId:@"mob" product:@"zelle" ssoKey:@"" title:@"" bgColor:@"" loaderData:@{@"loaderColor":@""} parameters:@{@"key":@"value"}];

  Bridge * bridge = [[Bridge alloc] initWithConfig:zelle viewController:controller];

  CGRect zelleFrame = CGRectMake(0, 0, 300, 300);

  UIView * zelleView = [bridge viewWithFrame:zelleFrame];

  //[self.view addSubview:zelleView];
  
  //UIView * customView = [[UIView alloc] init];
  //customView.backgroundColor = [UIColor redColor];
  return zelleView;
}


@end
