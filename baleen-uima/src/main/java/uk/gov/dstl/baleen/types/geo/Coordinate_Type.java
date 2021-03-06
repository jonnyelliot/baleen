/* First created by JCasGen Wed Jan 21 12:48:50 GMT 2015 */
// Dstl (c) Crown Copyright 2017
package uk.gov.dstl.baleen.types.geo;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import uk.gov.dstl.baleen.types.semantic.Location_Type;

/**
 * A well-formed coordinate value - MGRS or WGS84 DD or DMS coordinate system - explicitly defined
 * in source document. Updated by JCasGen Tue Apr 12 12:06:36 BST 2016
 *
 * @generated
 */
public class Coordinate_Type extends Location_Type {
  /** @generated */
  @SuppressWarnings("hiding")
  public static final int typeIndexID = Coordinate.typeIndexID;
  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public static final boolean featOkTst =
      JCasRegistry.getFeatOkTst("uk.gov.dstl.baleen.types.geo.Coordinate");

  /** @generated */
  final Feature casFeat_coordinateValue;
  /** @generated */
  final int casFeatCode_coordinateValue;
  /**
   * @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public String getCoordinateValue(int addr) {
    if (featOkTst && casFeat_coordinateValue == null)
      jcas.throwFeatMissing("coordinateValue", "uk.gov.dstl.baleen.types.geo.Coordinate");
    return ll_cas.ll_getStringValue(addr, casFeatCode_coordinateValue);
  }
  /**
   * @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setCoordinateValue(int addr, String v) {
    if (featOkTst && casFeat_coordinateValue == null)
      jcas.throwFeatMissing("coordinateValue", "uk.gov.dstl.baleen.types.geo.Coordinate");
    ll_cas.ll_setStringValue(addr, casFeatCode_coordinateValue, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   *
   * @generated
   * @param jcas JCas
   * @param casType Type
   */
  public Coordinate_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_coordinateValue =
        jcas.getRequiredFeatureDE(casType, "coordinateValue", "uima.cas.String", featOkTst);
    casFeatCode_coordinateValue =
        (null == casFeat_coordinateValue)
            ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_coordinateValue).getCode();
  }
}
