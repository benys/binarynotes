
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1Choice;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1Integer;
import org.bn.annotations.ASN1OctetString;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1Sequence;
import org.bn.annotations.ASN1SequenceOf;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;




    @ASN1PreparedElement
    @ASN1Sequence ( name = "TestSequenceWithNonames", isSet = false )
    public class TestSequenceWithNonames implements IASN1PreparedElement {
            

       @ASN1PreparedElement
       @ASN1Sequence ( name = "seq" , isSet = false )
       public static class SeqSequenceType implements IASN1PreparedElement {
                @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "it1", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Long it1 = null;
                
  
        
        public Long getIt1 () {
            return this.it1;
        }

        
        public boolean isIt1Present () {
            return this.it1 != null;
        }
        

        public void setIt1 (Long value) {
            this.it1 = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_SeqSequenceType;
        }

       private static IASN1PreparedElementData preparedData_SeqSequenceType = CoderFactory.getInstance().newPreparedElementData(SeqSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "seq", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private SeqSequenceType seq = null;
                
  
        
    @ASN1PreparedElement
    @ASN1Choice ( name = "ch" )
    public static class ChChoiceType implements IASN1PreparedElement {
            @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "it1", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Long it1 = null;
                
  @ASN1OctetString( name = "" )
    
        @ASN1Element ( name = "it2", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private byte[] it2 = null;
                
  
        
        public Long getIt1 () {
            return this.it1;
        }

        public boolean isIt1Selected () {
            return this.it1 != null;
        }

        private void setIt1 (Long value) {
            this.it1 = value;
        }

        
        public void selectIt1 (Long value) {
            this.it1 = value;
            
                    setIt2(null);
                            
        }

        
  
        
        public byte[] getIt2 () {
            return this.it2;
        }

        public boolean isIt2Selected () {
            return this.it2 != null;
        }

        private void setIt2 (byte[] value) {
            this.it2 = value;
        }

        
        public void selectIt2 (byte[] value) {
            this.it2 = value;
            
                    setIt1(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_ChChoiceType;
        }

        private static IASN1PreparedElementData preparedData_ChChoiceType = CoderFactory.getInstance().newPreparedElementData(ChChoiceType.class);

    }

                
        @ASN1Element ( name = "ch", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private ChChoiceType ch = null;
                
  

       @ASN1PreparedElement
       @ASN1Sequence ( name = "seqf" , isSet = false )
       public static class SeqfSequenceType implements IASN1PreparedElement {
                @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "it1", isOptional =  true , hasTag =  false  , hasDefaultValue =  false  )
    
	private Long it1 = null;
                
  
        
        public Long getIt1 () {
            return this.it1;
        }

        
        public boolean isIt1Present () {
            return this.it1 != null;
        }
        

        public void setIt1 (Long value) {
            this.it1 = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_SeqfSequenceType;
        }

       private static IASN1PreparedElementData preparedData_SeqfSequenceType = CoderFactory.getInstance().newPreparedElementData(SeqfSequenceType.class);
                
       }

       
                
@ASN1SequenceOf( name = "seqf", isSetOf = false ) 

    
        @ASN1Element ( name = "seqf", isOptional =  false , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private java.util.Collection<SeqfSequenceType>  seqf = null;
                
  
        
        public SeqSequenceType getSeq () {
            return this.seq;
        }

        

        public void setSeq (SeqSequenceType value) {
            this.seq = value;
        }
        
  
        
        public ChChoiceType getCh () {
            return this.ch;
        }

        

        public void setCh (ChChoiceType value) {
            this.ch = value;
        }
        
  
        
        public java.util.Collection<SeqfSequenceType>  getSeqf () {
            return this.seqf;
        }

        

        public void setSeqf (java.util.Collection<SeqfSequenceType>  value) {
            this.seqf = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TestSequenceWithNonames.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            