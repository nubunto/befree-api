(defproject befree-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.0"]
                 [ring/ring-defaults "0.2.1"]
                 [cheshire "5.8.0"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [oksql "1.2.1"]]
  :main befree-api.core
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler befree-api.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]
          :uberjar {:aot :all}}})
