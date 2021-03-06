
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1Sequence;
import org.bn.annotations.ASN1String;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;
import org.bn.coders.TagClass;
import org.bn.coders.UniversalTag;




    @ASN1PreparedElement
    @ASN1Sequence ( name = "ITUSequence", isSet = false )
    public class ITUSequence implements IASN1PreparedElement {
            
    @ASN1String( name = "", 
        stringType =  UniversalTag.VisibleString , isUCS = false )
    
        @ASN1Element ( name = "type1", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private String type1 = null;
                
  
        @ASN1Element ( name = "type2", isOptional =  false , hasTag =  true, tag = 3, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
	private ITUType1 type2 = null;
                
  
        @ASN1Element ( name = "type3", isOptional =  false , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private ITUType2 type3 = null;
                
  
        @ASN1Element ( name = "type4", isOptional =  false , hasTag =  true, tag = 7, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
	private ITUType3 type4 = null;
                
  
        @ASN1Element ( name = "type5", isOptional =  true , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private ITUType2 type5 = null;
                
  
    @ASN1String( name = "", 
        stringType =  UniversalTag.VisibleString , isUCS = false )
    
        @ASN1Element ( name = "type6", isOptional =  false , hasTag =  true, tag = 7 , hasDefaultValue =  false  )
    
	private String type6 = null;
                
  
        @ASN1Element ( name = "type7", isOptional =  false , hasTag =  true, tag = 8 , hasDefaultValue =  false  )
    
	private ITUType6 type7 = null;
                
  
        
        public String getType1 () {
            return this.type1;
        }

        

        public void setType1 (String value) {
            this.type1 = value;
        }
        
  
        
        public ITUType1 getType2 () {
            return this.type2;
        }

        

        public void setType2 (ITUType1 value) {
            this.type2 = value;
        }
        
  
        
        public ITUType2 getType3 () {
            return this.type3;
        }

        

        public void setType3 (ITUType2 value) {
            this.type3 = value;
        }
        
  
        
        public ITUType3 getType4 () {
            return this.type4;
        }

        

        public void setType4 (ITUType3 value) {
            this.type4 = value;
        }
        
  
        
        public ITUType2 getType5 () {
            return this.type5;
        }

        
        public boolean isType5Present () {
            return this.type5 != null;
        }
        

        public void setType5 (ITUType2 value) {
            this.type5 = value;
        }
        
  
        
        public String getType6 () {
            return this.type6;
        }

        

        public void setType6 (String value) {
            this.type6 = value;
        }
        
  
        
        public ITUType6 getType7 () {
            return this.type7;
        }

        

        public void setType7 (ITUType6 value) {
            this.type7 = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(ITUSequence.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            