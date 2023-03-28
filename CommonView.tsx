import React, {useEffect, useRef} from 'react';
import {Dimensions, Text, TouchableOpacity, useWindowDimensions, View, NativeModules} from 'react-native';
import {
  PixelRatio,
  UIManager,
  findNodeHandle,
  Platform,
} from 'react-native';

import {MyViewManager} from './MyViewManager';
import MapView from './MapView'


const createFragment = viewId =>
  UIManager.dispatchViewManagerCommand(
    viewId,
    // we are calling the 'create' command
    UIManager.MyViewManager.Commands.create.toString(),
    [viewId],
  );

  const dd = NativeModules.MyModule.zelleData('dhayalu', '1234');

export const CommonView = () => {

  if (Platform.OS === "ios"){
    return <MapView style={{flex: 1}} />;
  }else if (Platform.OS === "android"){

    const ref = useRef(null);

  useEffect(() => {
    const viewId = findNodeHandle(ref.current);
    createFragment(viewId);
  }, []);

  return (
    <MyViewManager
      style={{
        // converts dpi to px, provide desired height
        height: PixelRatio.getPixelSizeForLayoutSize(Dimensions.get('window').height),
        // converts dpi to px, provide desired width
        width: PixelRatio.getPixelSizeForLayoutSize(Dimensions.get('window').width),
        
      }}
      ref={ref}
    />
  );
  }else{
    const MyButton = (props: {label: string}) => (
      <View style={{marginTop: 50}}>
        <Text>{props.label}</Text>
      </View>
    );

    <TouchableOpacity>
    <MyButton label="Press me!" />
  </TouchableOpacity>
  }

};
export default CommonView;