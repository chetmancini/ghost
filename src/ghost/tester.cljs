(ns ghost.tester
  :import [ghost.core :refer *casper*]
  (:refer-clojure :exclude [repeat assert comment]))

(def require-js js/require)

;;
;; Casper instance
;;
(def ^{:doc "Default tester instance"
       :dynamic true}
  *tester* (.create (require-js "tester")))

;;
;; Tester API
;;

(defn abort
  ([] (.abort *tester*))
  ([message] (.abort *tester* message)))

(defn skip [num-tests message] (.skip *tester* num-tests message))

(defn assert
  ([subject message] (.assert *tester* subject message))
  ([subject message context] (.assert *tester* subject message context)))
(def assert-true assert)

(defn assert-equals
  ([subject expected] (.assertEquals *tester* subject expected))
  ([subject expected message] (.assertEquals *tester* subject expected message)))

(defn assert-not-equals
  ([subject shouldnt] (.assertNotEquals *tester* subject shouldnt))
  ([subject shouldnt message] (.assertNotEquals *tester* subject shouldnt message)))

(defn assert-element-count
  ([sel cnt] (.assertElementCount *tester* sel cnt))
  ([sel cnt message] (.assertElementCount *tester* sel cnt message)))

(defn assert-evaluate
  ([f message] (.assertEvaluate *tester* f message))
  ([f message params] (.assertEvaluate *tester* f message params)))
(def assert-eval assert-evaluate)

(defn assert-eval-equals
  ([f expected message] (.assertEvalEquals *tester* f message))
  ([f expected message params] (.assertEvalEquals *tester* f message params)))
(def assert-eval-equal assert-eval-equals)

(defn assert-fail [f message] (.assertFail *tester* f message))

(defn assert-field
  ([input expected message] (.assertField *tester* input expected message options))
  ([input expected message options] (.assertField *tester* input expected message options)))

(defn assert-field-css [css-selector expected message]
  (.assertFieldCSS *tester* css-selector expected message))

(defn assert-field-xpath [] ())

(defn assert-exists [sel message] (.assertExists *tester* sel message))
(def assert-exist assert-exists)
(def assert-selector-exist assert-exists)
(def assert-selector-exists assert-exists)

(defn assert-doesnt-exists [sel message] (.assertDoesntExists *tester* sel message))
(def assert-doesnt-exist assert-doesnt-exists)

(defn assert-http-status [status message] (.assertHttpStatus *tester* status message))

(defn assert-match [subject pattern message] (.assertMatch *tester* subject pattern message))
(def assert-matches assert-match)

(defn assert-false [condition message] (.assertFalse *tester* condition message))
(def assert-not assert-false)

(defn assert-not-visible [expected message] (.assertNotVisible *tester* expected message))
(def assert-invisible assert-not-visible)

(defn assert-raises [f args message] (.assertRaises *tester* f args message))
(def assert-raise assert-raises)
(def assert-throws assert-raises)

(defn assert-resource-exists [f message] (.assertResourceExists *tester* f message))
(def assert-resource-exist assert-resource-exists)

(defn assert-text-doesnt-exist [text message] (.assertTextDoesntExist *tester* text message))

(defn assert-text-exists [text message] (.assertTextExists *tester* text message))
(def assert-text-exist assert-text-exists)

(defn assert-truthy [subject message] (.assertTruthy *tester* subject message))

(defn assert-falsy [subject message] (.assertFalsy *tester* subject message))

(defn assert-selector-has-text [sel text message] (.assertSelectorHasText *tester* sel text message))
(def assert-selector-contains assert-selector-has-text)

(defn assert-selector-doesnt-have-text [sel text message] (.assertSelectorDoesntHaveText *tester* sel text message))
(def assert-selector-doesnt-contain assert-selector-doesnt-have-text)

(defn assert-title [expected message] (.assertTitle *tester* expected message))

(defn assert-title-match [pattern message] (.assertTitleMatch *tester* pattern message))
(def assert-title-matches assert-title-match)

(defn assert-type [subject typ message] (.assertType *tester* subject typ message))

(defn assert-instance-of [subject constructor message] (.assertInstanceOf *tester* subject constructor message))

(defn assert-url-match [pattern message] (.assertUrlMatch *tester* pattern message))
(def assert-url-matches assert-url-match)

(defn assert-visible [sel message] (.assertVisible *tester* sel message))

(defn bar [text style] (.bar *tester* text style))

(defn set-up [f] (.setUp *tester* f))

(defn tear-down [f] (.tearDown *tester* f))

(defn begin [] (.begin *tester*))

(defn comment [message] (.comment *tester* message))

(defn done [] (.done *tester*))

(defn error [message] (.error *tester* message))

(defn exec [file] (.exec *tester* file))

(defn info [message] (.info *tester* message))

(defn run-suites [] (.runSuites *tester*))

(defn run-test [test-file] (.runTest *tester* test-file))

(defn terminate [message] (.terminate *tester* message))

(defn save-results [file-path] (.saveResults *tester* file-path))

(defn calculate-duration (.calculateDuration *tester*))


