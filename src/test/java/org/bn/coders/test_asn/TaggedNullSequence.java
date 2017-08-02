
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1BoxedType;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1Null;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "TaggedNullSequence" )
    public class TaggedNullSequence implements IASN1PreparedElement {
                
        
        @ASN1Null ( name = "TaggedNullSequence" ) 
    
        @ASN1Element ( name = "TaggedNullSequence", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
        private org.bn.types.NullObject  value;        

        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TaggedNullSequence.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            