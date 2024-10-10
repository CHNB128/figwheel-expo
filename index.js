import { registerRootComponent } from "expo";
import { npmDeps } from "./target/public/cljs-out/android/npm_deps.js";

var options = {
  optionsUrl:
    "http://localhost:8081/target/public/cljs-out/android/cljsc_opts.json",
};

var figBridge = require("react-native-figwheel-bridge");
figBridge.shimRequire(npmDeps);
registerRootComponent(figBridge.createBridgeComponent(options));
