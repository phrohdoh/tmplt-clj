(defproject my-clj-app "0.1.0-SNAPSHOT"
  :main ^:skip-aot my-clj-app.core
  :target-path "target/%s"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
