package org.camunda.bpm.spring.boot.starter.property;

import static org.camunda.bpm.spring.boot.starter.property.CamundaBpmProperties.joinOn;

public class JobExecutionProperty {

  /**
   * enables job execution
   */
  private boolean enabled;

  /**
   * if job execution is deployment aware
   */
  private boolean deploymentAware;

  private int corePoolSize = 3;
  private int maxPoolSize = 10;
  private Integer keepAliveSeconds;
  private Integer queueCapacity;

  /*
   * properties for job executor
   */
  private Integer lockTimeInMillis;
  private Integer maxJobsPerAcquisition;
  private Integer waitTimeInMillis;
  private Long maxWait;
  private Integer backoffTimeInMillis;
  private Long maxBackoff;
  private Integer backoffDecreaseThreshold;
  private Float waitIncreaseFactor;

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public boolean isDeploymentAware() {
    return deploymentAware;
  }

  public void setDeploymentAware(boolean deploymentAware) {
    this.deploymentAware = deploymentAware;
  }

  public int getCorePoolSize() {
    return corePoolSize;
  }

  public void setCorePoolSize(int corePoolSize) {
    this.corePoolSize = corePoolSize;
  }

  public int getMaxPoolSize() {
    return maxPoolSize;
  }

  public void setMaxPoolSize(int maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  public Integer getKeepAliveSeconds() {
    return keepAliveSeconds;
  }

  public void setKeepAliveSeconds(Integer keepAliveSeconds) {
    this.keepAliveSeconds = keepAliveSeconds;
  }

  public Integer getQueueCapacity() {
    return queueCapacity;
  }

  public void setQueueCapacity(Integer queueCapacity) {
    this.queueCapacity = queueCapacity;
  }

  public Integer getLockTimeInMillis() {
    return lockTimeInMillis;
  }

  public void setLockTimeInMillis(Integer lockTimeInMillis) {
    this.lockTimeInMillis = lockTimeInMillis;
  }

  public Integer getMaxJobsPerAcquisition() {
    return maxJobsPerAcquisition;
  }

  public void setMaxJobsPerAcquisition(Integer maxJobsPerAcquisition) {
    this.maxJobsPerAcquisition = maxJobsPerAcquisition;
  }

  public Integer getWaitTimeInMillis() {
    return waitTimeInMillis;
  }

  public void setWaitTimeInMillis(Integer waitTimeInMillis) {
    this.waitTimeInMillis = waitTimeInMillis;
  }

  public Long getMaxWait() {
    return maxWait;
  }

  public void setMaxWait(Long maxWait) {
    this.maxWait = maxWait;
  }

  public Integer getBackoffTimeInMillis() {
    return backoffTimeInMillis;
  }

  public void setBackoffTimeInMillis(Integer backoffTimeInMillis) {
    this.backoffTimeInMillis = backoffTimeInMillis;
  }

  public Long getMaxBackoff() {
    return maxBackoff;
  }

  public void setMaxBackoff(Long maxBackoff) {
    this.maxBackoff = maxBackoff;
  }

  public Integer getBackoffDecreaseThreshold() {
    return backoffDecreaseThreshold;
  }

  public void setBackoffDecreaseThreshold(Integer backoffDecreaseThreshold) {
    this.backoffDecreaseThreshold = backoffDecreaseThreshold;
  }

  public Float getWaitIncreaseFactor() {
    return waitIncreaseFactor;
  }

  public void setWaitIncreaseFactor(Float waitIncreaseFactor) {
    this.waitIncreaseFactor = waitIncreaseFactor;
  }

  @Override
  public String toString() {
    return joinOn(this.getClass())
      .add("enabled=" + enabled)
      .add("deploymentAware=" + deploymentAware)
      .add("corePoolSize=" + corePoolSize)
      .add("maxPoolSize=" + maxPoolSize)
      .add("keepAliveSeconds=" + keepAliveSeconds)
      .add("queueCapacity=" + queueCapacity)
      .add("lockTimeInMillis=" + lockTimeInMillis)
      .add("maxJobsPerAcquisition=" + maxJobsPerAcquisition)
      .add("waitTimeInMillis=" + waitTimeInMillis)
      .add("maxWait=" + maxWait)
      .add("backoffTimeInMillis=" + backoffTimeInMillis)
      .add("maxBackoff=" + maxBackoff)
      .add("backoffDecreaseThreshold=" + backoffDecreaseThreshold)
      .add("waitIncreaseFactor=" + waitIncreaseFactor)
      .toString();
  }

}
