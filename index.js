import { registerRootComponent } from 'expo';

import MyApp from './MyApp';
import App from './App';
import MyView from './MyView';
import CommonView from './CommonView';
//import { Platform } from 'react-native/types';

// registerRootComponent calls AppRegistry.registerComponent('main', () => App);
// It also ensures that whether you load the app in Expo Go or in a native build,
// the environment is set up appropriately


registerRootComponent(CommonView);
