(ns awesome.main
  (:require [react]
            [react-native :as rn]
            [expo-constants :as expo-constants]))

(def <> react/createElement)

(defn renderfn [props]
  (.log js/console (.-systemFonts (.-default expo-constants)))
  (<> rn/View
      #js {:style #js {:backgroundColor "#FFFFFF"
                       :flex 1
                       :justifyContent "center"}}
      (<> rn/Text
          #js {:style #js {:color "black"
                           :textAlign "center"}}
          "HELLO WORLD!")))

;; the function figwheel-rn-root must be provided. It will be called by 
;; react-native-figwheel-bridge to render your application. 
;; You can configure the name of this function with config.renderFn
(defn figwheel-rn-root []
  (renderfn {}))
