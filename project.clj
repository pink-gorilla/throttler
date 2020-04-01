(defproject org.pinkgorilla/throttler "1.0.2"
  :description "Control the throughput of function calls and core.async channels using the token bucket algorithm"
  :url "https://github.com/brunoV/throttler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories [["releases" {:url           "https://clojars.org/repo"
                                     :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 ;[org.clojure/core.async "0.4.490"]
                 [org.clojure/core.async "1.1.582"]
                 ]
    :plugins [[lein-ancient "0.6.15"]]
  :profiles {:dev {:dependencies [[midje "1.9.9"]
                                  [criterium "0.4.5"]]
                   :plugins [[lein-midje "3.1.1"]]}})
