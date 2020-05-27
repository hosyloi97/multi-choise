/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic.hust.multiple.choise.service;

import java.util.List;
import sic.hust.multiple.choise.model.Topic;

/**
 *
 * @author Mr Loi Ho
 */
public interface ITopicService {

    public List<Topic> findAllTopics();

    public Topic findTopicById(int id);
}
