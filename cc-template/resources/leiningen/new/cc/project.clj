(defproject {{name}} "0.1.0"
  :description "write description"
  :url "http://www.tabuyos.com"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :repositories [["AliyunPublic" {:url "https://maven.aliyun.com/repository/public"}]
                 ["TsingHua" {:url "https://mirrors.tuna.tsinghua.edu.cn/clojars"}]]
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :target-path "target/%s"
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :test-paths ["test/main/java" "test/main/clojure"]
  :resource-paths ["src/main/resources" "test/main/resources"]
  :aot :all
  :main {{name}}.core
  :repl-options {:init-ns {{name}}.core})
