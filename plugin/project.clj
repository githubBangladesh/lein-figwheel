(defproject lein-figwheel "0.1.7-SNAPSHOT"
  :description "ClojureScript Autobuilder/Server which pushes changed files to the browser."
  :url "https://github.com/bhauman/lein-figwheel"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[cljsbuild "1.0.3"]
                 [figwheel "0.1.7-SNAPSHOT"]]

  :scm { :name "git"
         :url "https://github.com/bhauman/lein-figwheel"}
  :eval-in-leiningen true)
