/* First created by JCasGen Wed Jan 14 12:58:18 GMT 2015 */
// Dstl (c) Crown Copyright 2017
package uk.gov.dstl.baleen.types.language;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import uk.gov.dstl.baleen.types.Base_Type;

/**
 * Specifies a lemma form for a word token Updated by JCasGen Wed Apr 13 13:23:16 BST 2016
 *
 * @generated
 */
public class WordLemma_Type extends Base_Type {
  /** @generated */
  @SuppressWarnings("hiding")
  public static final int typeIndexID = WordLemma.typeIndexID;
  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public static final boolean featOkTst =
      JCasRegistry.getFeatOkTst("uk.gov.dstl.baleen.types.language.WordLemma");

  /** @generated */
  final Feature casFeat_partOfSpeech;
  /** @generated */
  final int casFeatCode_partOfSpeech;
  /**
   * @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public String getPartOfSpeech(int addr) {
    if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "uk.gov.dstl.baleen.types.language.WordLemma");
    return ll_cas.ll_getStringValue(addr, casFeatCode_partOfSpeech);
  }
  /**
   * @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setPartOfSpeech(int addr, String v) {
    if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "uk.gov.dstl.baleen.types.language.WordLemma");
    ll_cas.ll_setStringValue(addr, casFeatCode_partOfSpeech, v);
  }

  /** @generated */
  final Feature casFeat_lemmaForm;
  /** @generated */
  final int casFeatCode_lemmaForm;
  /**
   * @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public String getLemmaForm(int addr) {
    if (featOkTst && casFeat_lemmaForm == null)
      jcas.throwFeatMissing("lemmaForm", "uk.gov.dstl.baleen.types.language.WordLemma");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lemmaForm);
  }
  /**
   * @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setLemmaForm(int addr, String v) {
    if (featOkTst && casFeat_lemmaForm == null)
      jcas.throwFeatMissing("lemmaForm", "uk.gov.dstl.baleen.types.language.WordLemma");
    ll_cas.ll_setStringValue(addr, casFeatCode_lemmaForm, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   *
   * @generated
   * @param jcas JCas
   * @param casType Type
   */
  public WordLemma_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_partOfSpeech =
        jcas.getRequiredFeatureDE(casType, "partOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_partOfSpeech =
        (null == casFeat_partOfSpeech)
            ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_partOfSpeech).getCode();

    casFeat_lemmaForm =
        jcas.getRequiredFeatureDE(casType, "lemmaForm", "uima.cas.String", featOkTst);
    casFeatCode_lemmaForm =
        (null == casFeat_lemmaForm)
            ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_lemmaForm).getCode();
  }
}
