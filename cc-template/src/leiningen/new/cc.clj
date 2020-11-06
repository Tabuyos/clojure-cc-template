(ns leiningen.new.cc
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cc"))

(defn cc
  "Generate common clojure project."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' cc project.")
    (->files data
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render "gitignore" data)]
             "src/main/clojure"
             "src/main/java"
             "src/main/resources"
             "test/main/clojure"
             "test/main/java"
             "test/main/resources"
             ["src/main/clojure/{{sanitized}}/core.clj" (render "core.clj" data)]
             )
    ))
