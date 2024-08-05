(ns test
  (:require [replicant.dom :as replicant]))


(def el (js/document.getElementById "app"))

(defn ^:export init []
  (replicant/set-dispatch! identity)
  (replicant/render el [:h1 "Hello world!"])

)
