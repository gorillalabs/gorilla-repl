;;;; This file is part of gorilla-repl. Copyright (C) 2014-, Jony Hudson.
;;;;
;;;; gorilla-repl is licenced to you under the MIT licence. See the file LICENCE.txt for full details.

(ns gorilla-repl.html
  (:require [gorilla-renderable.core :as render]))

(defrecord Html [content])

(defn as-html [content]
  (Html. content))

(extend-type Html
  render/Renderable
  (render [self]
    {:type :html :content (:content self) :value (pr-str self)}))
