/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JUDE
 */
public class SLLNode
{
    public int info;
    public SLLNode next;
    
    
    public SLLNode()
    {
       next=null;
    }
    
    public SLLNode(int element)
    {
        info = element;
        next = null;
    }
    public SLLNode(int element, SLLNode pointer)
    {
        info = element;
        next= pointer;
    }
            
}
